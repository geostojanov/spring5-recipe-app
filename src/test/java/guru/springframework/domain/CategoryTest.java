package guru.springframework.domain;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

import static org.junit.Assert.assertEquals;

public class CategoryTest {

    private Category category;

    @Before
    public void setUp() {
        category = new Category();
    }

    @Test
    public void testGetId() {
        Long idValue = 4L;
        category.setId(idValue);
        assertEquals(idValue, category.getId());
    }

    @Test
    public void testGetDescription() {
        String description = "CategoryDescriptionTestString";
        category.setDescription(description);
        assertEquals(description, category.getDescription());
    }

    @Test
    public void testGetRecipes() {
        Set<Recipe> recipes = new HashSet<>();
        Recipe recipe = new Recipe();
        recipes.add(recipe);
        category.setRecipes(recipes);
        assertEquals(1, category.getRecipes().size());
    }
}